
let employees;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://Lesson48ClassworkDBServer.ernestoporchett.repl.co";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;

  let output = document.getElementById("output");
  let build ="";

    for(let i=0; i<employees.length; i++){
    let employee = employees[i]
    build += `<h4> Employee ID : ${employee.EmployeeId}</h4>`;
    build += `<span> First Name : ${employee.FirstName}</span><br>`;
    build += `<span> Last Name : ${employee.LastName}</span>`;
    build += `<hr>`;
  }

  output.innerHTML = build;
  

}