var sql = require("mysql");

var con = sql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    database: 'mydb'
})

con.connect(function(err){
    if(err) throw err;
    console.log("Connected!");

    var q = "select * from customers";
    con.query(q, function(err, result, fields){
        if(err) throw err;
        console.log(result);
    })
})