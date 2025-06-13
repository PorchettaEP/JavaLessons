
let data;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "";
  let route= "/customers"
  customers = $.getJSON(link+route).responseJSON;

  // 1- getelement output
  let output = document.getElementById("output");
  let build ="";

  // Using string interpolation need to use the backtick `` character
  // Review h1..6, span, p , inline vs block elements
  //h4,p are inline, span is inline
  for(let i=0; i<customers.length; i++){
    let customer = customers[i]
    build += `<h3> Customer ID : ${customer.CustomerId}</h3>`;
    build += `<div> First Name : ${customer.FirstName}</div>`;
    build += `<div> Last Name : ${customer.LastName}</div>`;
    build += `<p> Email : ${customer.Email}</p>`;
    build += `<hr>`;
  }

  // Now inject the build content into the output container
  output.innerHTML = build;

  


}