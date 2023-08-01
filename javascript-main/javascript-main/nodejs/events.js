// var fs = require('fs');

// var rs = fs.createReadStream('./demo_text.txt');

// rs.on('open',function(){
//     console.log("The file is open");
// });

var events = require('events');

var eventEmitter = new events.EventEmitter();

