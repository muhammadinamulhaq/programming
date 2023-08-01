var fs = require('fs');

fs.appendFile('new_text.txt', "Hello Node", function(err){
    if(err) throw err
    console.log('Saved!');
})

fs.open('new_text.txt', "w", function(err, file){
    if(err) throw err
    console.log("OSaved!");
})

fs.unlink('new_text.txt', function(err){
    if(err) throw err
    console.log('File Deleted');
})