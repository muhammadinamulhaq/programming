public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if(((bigCount * 5) + smallCount) < goal){
            return false;
        }

        return goal%5 <= smallCount;

//        boolean can_Pack = false;
//        int totalKilos = (bigCount * 5) + smallCount;

//        if(totalKilos == goal){
//            can_Pack = true;
//        }else if((bigCount * 5) == goal){
//            can_Pack = true;
//        }else if((bigCount * 5) < goal){
//            goal -= (bigCount * 5);
//            if(goal <= smallCount){
//                can_Pack = true;
//            }
//        }else if((bigCount * 5) > goal){
//            goal %= 5;
//            if(goal <= smallCount){
//                can_Pack = true;
//            }
//        }

//        return can_Pack;
    }
}
