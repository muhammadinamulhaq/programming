function greet() {
  console.log('Hello')
}

setTimeout(greet, 2000)
// the function greet will be called after 2 seconds

function greet2(name) {
  console.log(`hello ${name}`)
}

const timeoutId = setTimeout(greet2, 2000, 'abhishek')
clearInterval(timeoutId)
// nothing is logged because the timeout is cleared

const intervalId = setInterval(greet2, 1000, 'abhishek')
// clearInterval(intervalId)
// console.log(intervalId)
console.log('I will run first')
clearInterval(intervalId)

// callbacks

function greet3(name) {
  console.log(`greet3 ${name}`)
}

function higherOrderFunction(callback) {
  const name = 'abhishek'
  callback(name)
}

higherOrderFunction(greet3)

const promise = new Promise((resolve, reject) => {})
