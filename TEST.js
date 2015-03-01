function greeting(name){
    var text = "Hello " + name;
    var greet = function(){
        console.log(text);
    }
    return greet();
}