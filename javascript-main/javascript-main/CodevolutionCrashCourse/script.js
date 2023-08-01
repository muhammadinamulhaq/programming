// log a statement using console.log()
console.log('hello from script.js')

// variables
let age = 25
console.log(age)

const salary = 8000 // must be initialized and cannot be changed, like final keyword in java
console.log(salary)

let sum = 0
sum = 5
console.log(sum)

// data types

// strings
const firstName = 'Abhishek'
const lastName = 'Chandra'
const language = `JavaScript` // a string can have single quotes or double quotes or backticks

// float / number
const total = 0
const PI = 3.14

// booleans
const isPrimaryNumber = true
const isNewUser = false

// undefined: if the variable is declared but a value is not assigned to it
let result
console.log(result)

// we can assign a value to a variable later, intializing with undefined
// const res = undefined
const res = null // use this

// null: if the value is unknown or empty
const data = null

// object literal, key can only be a string or a symbol, value can be anything
const person = {
  firstName: 'Abhishek',
  lastName: 'Chandra',
  age: 22,
}

// if the key doesnot contain any spaces, we can remove the quotes

// to access the value of a key, use dot notation
console.log(person.firstName)

// array object
const oddNumbers = [1, 3, 5, 7, 9]

console.log(oddNumbers[0]) // 1
console.log(oddNumbers[3]) // 4

// js is a dynamically typed language, so we don't have to specify the type of the variable
// which also means that data types are automatically converted as needed during runtime

let a = 10
a = 'hello'
a = true
console.log(a) // last assigned value is printed

// operators
x = 5
let y = 10

console.log(x++)

console.log(x === y)
console.log(x !== y)

const isValidNumber = x < 8 && 8 < y
console.log(isValidNumber)

const isValid = true
console.log(!isValid)

console.log('Bruce ' + 'Wayne')

const isEven = 10 % 2 == 0 ? 'Number is even' : 'Number is odd'
console.log(isEven)

// implicit type conversion

// number + string = string
console.log(2 + '3')

// boolean + string = string
console.log(true + '3')

// js converts both 2 and 4 to number and then performs subtraction
console.log('2' - '4')

console.log('2' / '4')

// if we use a non numeric string, js converts it to NaN
console.log('2' / 'a')

console.log('Bruce' - 'Wayne')

console.log('5' - true)

console.log('5' % true)

console.log('5' - null)

console.log(5 + undefined)

// explicit type conversion

console.log(Number('5'))
console.log(Number(''))
console.log(Number(false))

console.log(parseInt('3.14'))
console.log(parseFloat('3.14'))

console.log(String(500))
console.log(String(true))
console.log(String(null))
console.log(String(undefined))
console.log((500).toString()) // toString will not work with null and undefined
// console.log(undefined.toString())

console.log(Boolean(0)) // null undefined '' 0 NaN all return false
console.log(Boolean(10)) // everything else returns true
console.log(Boolean('  ')) // space is also a character
console.log(Boolean(null))

// Equality operators
// == checks for value equality (allows coercion)
// === checks for value and type equality (no coercion)

const var1 = 10
const var2 = '10'

console.log(var1 == var2) // true
console.log(var1 === var2) // true

// conditional statements

const num = 0

if (num > 0) {
  console.log('Number is positive')
} else if (num < 0) {
  console.log('Number is negative')
} else {
  console.log('Number is zero')
}

const color = 'bla'

switch (color) {
  case 'red':
    console.log('Color is red')
    break
  case 'blue':
    console.log('Color is blue')
    break
  case 'green':
    console.log('Color is green')
    break
  default:
    console.log('Color is not red, blue or green')
}

// const numbers = [1, 2, 3, 4, 5]
// console.log(numbers)

// looping code in js

// for loop
for (let i = 1; i <= 5; i++) {
  console.log('Iteration number' + i)
}

// while loop
let i = 1
while (i <= 5) {
  console.log('Iteration number' + i)
  i++
}

// do...while loop
do {
  console.log('Iteration number' + i)
  i++
} while (i <= 10)

// for of loop
const numArray = ['hi', 'i', 'am', 'abhishek']

for (const num of numArray) {
  console.log(num)
}

// functions

greet() // working due to hoisting of the function
greet('daina')
greet('bruce')
greet('clark')

function greet() {
  console.log('hello')
} // first greet not calling this function, instead it is passing an undefined value to the name parameter

function greet(name) {
  console.log('hello ' + name)
} // function overloading is not possible in js

function add(a, b) {
  return a + b
}

const sum1 = add(5, 6)
console.log(sum1)

// in 2015 arrow functions were introduced (a more concise way of writing functions)
// arrow functions do not have their own this keyword
// arrowSum is the function name
const arrowSum = (a, b) => {
  return a + b
}

const sum3 = arrowSum(6, 6)
console.log(sum3)

// if we have only one return statement in the arrow function, we can ommit the curly braces and the return keyword
const arrowSum2 = (a, b) => a + b

console.log(arrowSum2(7, 7))

// a without paranthesis is still valid
const addFive = (a) => a + 5

// Scope
// block scope, function scope, global scope

// block scope was introduced in es6 with let and const keywords
if (true) {
  // var name = 'abhishek' // this is a global variable
  let name = 'abhishek' // this is a local variable\
  console.log(name)
}

// console.log(name) // this will throw an error

// function scope
function testFn() {
  var myName = 'Batman'
}

// console.log(myName) // this will throw an error
