package com.abhishek.strings;

import java.util.*;

public class SJF {
    public static void main(String[] args)
    {
        int NumberOfProcesses = 5;

        // process and burst time initialization
        range.processID = Integer.MAX_VALUE;
        range.burstTime = Integer.MAX_VALUE;

        for (int i = 1; i <= 4 * sh + 1; i++)
        {
            segmentTree[i].processID = Integer.MAX_VALUE;
            segmentTree[i].burstTime = Integer.MAX_VALUE;
        }

        // Assigning Arrival time, Burst time and Process ID
        // to all the static array of processInfo for SJF implementation
        processInfo[1].arrival_time = 1;
        processInfo[1].burst_time = 7;
        processInfo[1].process_id = 1;

        processInfo[2].arrival_time = 2;
        processInfo[2].burst_time = 5;
        processInfo[2].process_id = 2;

        processInfo[3].arrival_time = 3;
        processInfo[3].burst_time = 1;
        processInfo[3].process_id = 3;

        processInfo[4].arrival_time = 4;
        processInfo[4].burst_time = 2;
        processInfo[4].process_id = 4;

        processInfo[5].arrival_time = 5;
        processInfo[5].burst_time = 8;
        processInfo[5].process_id = 5;

        executeSJF(NumberOfProcesses);

        printCalculatedTimes(NumberOfProcesses);
    }

    static int sh = 100000;

    static class info
    {
        int process_id; // PID
        int arrival_time; // AT
        int burst_time; // BT
        int completion_time; // CT
        int turn_around_time; // TAT
        int waiting_time; // WT
    }

    // processInfo Array to contain all the process information of type info
    static info[] processInfo = new info[sh + 1];

    // static block code for array initialization
    static
    {
        for (int i = 0; i < sh + 1; i++)
        {
            processInfo[i] = new info();
        }
    }

    static class info1
    {
        int processID;
        int burstTime;
    }

    static info1 range = new info1();

    // Segment tree array processing the queries with
    // time complexity O(N(logN))
    static info1[] segmentTree = new info1[4 * sh + 5];
    static {
        for (int i = 0; i < 4 * sh + 5; i++) {
            segmentTree[i] = new info1();
        }
    }

    // keeping a check where
    // a PID is present in our segmentTree info1 type array
    static int[] mp = new int[sh + 1];

    // method to update BT and PID in our segmentTree
    static void updateTree(int node, int start, int end,
                           int index, int pID, int bTime)
    {
        if (start == end) {
            segmentTree[node].processID = pID;
            segmentTree[node].burstTime = bTime;
            return;
        }
        int mid = (start + end) / 2;

        // recursive call to update
        if (index <= mid) {
            updateTree(2 * node, start, mid, index, pID, bTime);
        }
        else {
            updateTree(2 * node + 1, mid + 1, end, index, pID, bTime);
        }

        if (segmentTree[2 * node].burstTime < segmentTree[2 * node + 1].burstTime) {
            segmentTree[node].burstTime = segmentTree[2 * node].burstTime;
            segmentTree[node].processID = segmentTree[2 * node].processID;
        } else {
            segmentTree[node].burstTime = segmentTree[2 * node + 1].burstTime;
            segmentTree[node].processID = segmentTree[2 * node + 1].processID;
        }
    }

    // method to return the range minimum of the burst time
    // of all the arrived processes using segment tree
    static info1 queryProcess(int node, int start, int end,
                              int left, int right) {
        if ((end < left) || (start > right)) {
            return range;
        }
        if ((start >= left) && (end <= right)) {
            return segmentTree[node];
        }
        int mid = (start + end) / 2;
        info1 lm = queryProcess(2 * node, start, mid, left, right);
        info1 rm = queryProcess(2 * node + 1, mid + 1, end, left, right);

        if (lm.burstTime < rm.burstTime){
            return lm;
        }
        return rm;
    }

    // method to execute non_preemptive SJF and return the
    // CT, TAT and WT
    static void nonPreemptiveSJF(int n) {

        // to keep a count of the finished processes
        int count = n;

        // To keep the range of the processes that have arrived in the array
        int upper_range = 0;

        // Current running time
        int runningTime = Math.min(Integer.MAX_VALUE, processInfo[upper_range + 1].arrival_time);

        // to find the CPU processes where AT is less than or equal to their CT
        while (count != 0) {
            while (upper_range <= n) {
                upper_range++;
                if (processInfo[upper_range].arrival_time > runningTime || upper_range > n) {
                    upper_range--;
                    break;
                }

                updateTree(1, 1, n, upper_range, processInfo[upper_range].process_id,
                        processInfo[upper_range].burst_time);
            }

            // To find minimum CT from the processes whose
            // AT is less than or equal to their CT
            info1 result = queryProcess(1, 1, n, 1, upper_range);

            // Checking if the process has already been executed
            if (result.burstTime != Integer.MAX_VALUE) {
                count--;
                int index = mp[result.processID];
                runningTime += (result.burstTime);

                // Calculating and updating the array with
                // the CT, TAT and WT
                processInfo[index].completion_time = runningTime;
                processInfo[index].turn_around_time = processInfo[index].completion_time - processInfo[index].arrival_time;
                processInfo[index].waiting_time = processInfo[index].turn_around_time - processInfo[index].burst_time;

                // Updating the burst time to infinity, when the process has finished executing
                updateTree(1, 1, n, index, Integer.MAX_VALUE, Integer.MAX_VALUE);
            } else {
                runningTime = processInfo[upper_range + 1].arrival_time;
            }
        }
    }

    // to execute SJF algorithm and related methods in the program
    static void executeSJF(int n) {

        // Sorting the processInfo array based on the arrival times of the processes
        Arrays.sort(processInfo, 1, n, (a, b) -> {
            if (a.arrival_time == b.arrival_time)
                return a.process_id - b.process_id;
            return a.arrival_time - b.arrival_time;
        });
        for (int i = 1; i <= n; i++)
            mp[processInfo[i].process_id] = i;

        // invoking to perform non-preemptive-sjf
        nonPreemptiveSJF(n);
    }

    // print calculated times of each processID after the SJF execution
    static void printCalculatedTimes(int n) {
        System.out.println("PID ArrivalT BurstT CompletionT TAT WaitingT");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
                    processInfo[i].process_id, processInfo[i].arrival_time, processInfo[i].burst_time, processInfo[i].completion_time, processInfo[i].turn_around_time,
                    processInfo[i].waiting_time);
        }
    }
}