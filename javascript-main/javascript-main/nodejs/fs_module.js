var http = require('http');
var url = require('url');
var fs = require('fs');
const { listenerCount } = require('events');

// used to read, create, update, delete, rename files

http.createServer(function(req, res){
    fs.readFile('fs.html',function(err,data){
        res.writeHead(200, {'Content-Type' : 'text/html'});
        var q = url.parse(req.url, true).query;
        var txt = q.month + " " + q.year;
        res.write(data);
        res.write(txt);
        res.end();
    });
}).listen(8080);