// These concepts were introduced in ECMA2015 / ES6 script
// let and const keywords
// default arguments 
// destructuring
// object properties
// template strings
// arrow functions

// < --------- >
var check1 = 'doge'; // gives functional scope
let check2 = 'coin'; // gives block scope
const name1 = "Abhishek"; // gives global scope and can't be changed.

// Scope of let variable remain for a block of code, while var gives a functional scope
function check(){
    let a = 20;
    if(true){
        let a = 10;
        console.log(a); // prints 10 in console.
    } // let a = 10 scope end here
    console.log(a); // prints 20 in console
    console.log(name1);
    
}   // let a = 20 scope ends here.

check();

// < ---------- >
const biodata = {name: "abhishek", age:21, born: 'India'};
console.log(biodata)

// Destructuring

const {name, age, born} = biodata;
console.log(name)
console.log(age)
console.log(born)

// Template strings
let show = `My name is ${name} and My age is ${age}, I live in ${born}`;
console.log(show);

// < ----------- >
function funAge(age){
    return age;
}

funAge(18);

// default arguments
function funcAge(age = 18){
    return age;
}

funcAge();

// < ------- >
// object properties
const defaultval = {name : name, age: age, born: born};
console.log(defaultval)

const shortObj = {name, age, born};
console.log(shortObj);

// Arrow Functions or Fat arrow function / lambda
function addSum(a,b) { return a + b; } // simple function

let addsum = (a,b) => { // arrow function '=>' : fat arrow, '->' : thin arrow
    return a+b;
}
console.log(addSum(5,5));
console.log(addsum(5,4));