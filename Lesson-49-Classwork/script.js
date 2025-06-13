
let employees;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://Lesson48ClassworkDBServer.ernestoporchett.repl.co";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;

  let output = ""
  let build ="";

   

  


}