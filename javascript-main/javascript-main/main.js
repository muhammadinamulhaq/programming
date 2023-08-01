console.log('hello');

// How to write a comment inline
// alert('This is a javascript alert'); 

// Variable
var b = "Dogecoin";
console.log(b);

var someNum = 22;
console.log(someNum);

//  Manipulate DOM (Document Object Model) with Javascript
// It is just a fancy way of saying change HTML with Javascript

// var age = prompt('What is your age?');

// document.getElementById('someText').innerHTML = age;

var num = 5;

// Increment num1 by 1
num++;
console.log(num / 10);

// Decrement num1 by 1
num--;
console.log(num / 10);

/* Functions

1. Create a function
2. Call the function

*/

// Create
function fun(){
    console.log("This is a function");
}

// Call

fun();

// Let's create a function that take in a name and says hello followed by your name
//  Example Name: Abhishek, return : hello Abhishek

function greeting(yourName){
    var result = 'Hello ' + yourName; // String concatenation
    console.log(result);
}

// var name = prompt("Enter your name : ");
// greeting('Abhishek'); 

// How do argument works in function
// How do we add 2 numbers together in a function 
function sumNumbers(a, b){
    var res = a + b;
    console.log(res);
}

sumNumbers(10, 15);

// while (num < 10){
//     num++;
//     console.log(num)
// }

for(let num = 0; num < 10; num++){
    console.log(num)
}

// Data Types
let yourAge = 18; // number
let name1 = 'Doge'; // string
let name = {first : 'Abhishek', last : 'Chandra'} // object
let truth = false; // boolean
let groceries = ['banana', 'apple', 'guava', 'mango'] // array/list
let random; // undefined
let nothing = null; // value null

// strings in javascript

let fruits = "banana\napple" // new line
console.log(fruits.length);
console.log(fruits.indexOf('an')); // returns index of the argument from the string, else returns -1
console.log(fruits.slice(2,5));
console.log(fruits.replace('apple','banana'));
console.log(fruits.toUpperCase(fruits));
console.log(fruits);
console.log(fruits.split('\n')); // split by comma
console.log(fruits.split('')); // split by characters
console.log(fruits[2]);
console.log(fruits.charAt(2)); 

// Arrays

let products = ['fruits', 'cosmetics', 'vegetables', 'biscuits', 'medicines'];
products = new Array('fruits', 'cosmetics', 'vegetables', 'biscuits', 'medicines');

console.log(products[1]); // access values

products[1] = 'stationary'

console.log(products[1]); // access values

for(let i=0; i < products.length; ++i){
    console.log(products[i]); // access values
}

// arrays common methods
console.log(products);
console.log(products.toString());
console.log(products.join('-')); // join elements by '-', fruits-stationary-vegetables-biscuits-medicines
console.log(products.join('*')); 
console.log(products.pop(), products);  // removes last item
console.log(products.push('Clothes'), products); // appends item to the end
products[products.length] = 'Soap'; //products[5] = undefined, before executing this statement (Push)
products.shift(); // removes first element from an array
console.log(products);
products.unshift('Juices'); // removes first element from an array
console.log(products);

let vegetables = ['Carrot', 'Radish', 'Bottle Gourd', 'Tomato', 'Onion'];
let allGroceries = products.concat(vegetables);
console.log(allGroceries);
console.log(allGroceries.slice(1,4));
console.log(allGroceries.reverse());
console.log(allGroceries.sort()); 


let numbers = [5, 10, 2, 1, 9, 6];
console.log(numbers.sort(function(a,b){ return a-b})); //ascending order
console.log(numbers.sort(function(a,b){ return b-a})); //descending order

let empty = []; // or let empty = new Array();

for(let num = 0; num < 10; ++num){
    empty.push(num);
}

console.log(empty);

// Objects in Javascript
// dictionary in python

let student = {
               first: 'Siddharth', 
               last : 'Chandra', 
               age:24, 
               height: 1.75, 
               position:'Senior SE',
               studentInfo: function(){
                   return this.first + " " + this.last + " " + this.age + " " + this.height;
               }
};
console.log(student.first); // console.log(student[first]) causes an error (deprecated)
console.log(student.last);

student.first = "Abhishek"; // change value
console.log(student.first);
student.age -= 3;
console.log(student.studentInfo());

// Conditionals, control flows (if else)
// 18-35 are target demographic
// && Logical AND
// || Logical OR

// var age = prompt("What's your age?"); // maybe let won't work in many cases
var age = 12; // maybe let won't work in many cases

if(age >= 18 && age <= 35){
    status = "demo";
    console.log(status);
}else{
    status = "not my audi";
    console.log(status);
}

// Switch statements
// differentiate between weekday vs weekend
// day 0 --> sunday
// day 6 --> saturday
// day 4 --> thursday --> weekday

switch(6){
    case 0: 
        text = 'weekend';
        break;
    case 5:
        text = 'weekend';
        break;
    case 6:
        text = 'weekend';
        break;
    default:
        text = 'weekday';
}

console.log(text);

// json : javascript object notation
// contains data in light form
// in context with python it contains dictionaries inside a list (in array form)