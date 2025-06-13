
let data;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://81a8cb7b-3b64-4eb9-a860-2cd6bc5aaea9-00-3vy1w5fdrx1e5.worf.replit.dev";
  let route= "/customers"
  customers = $.getJSON(link+route).responseJSON;

  generateCards(customers)


}

function generateCards(customers){
  let output = document.getElementById("output");
  let build ="";

  for(let i=0; i<customers.length; i++){
    let customer = customers[i]
    build += `<div class="card" >`
    build += `<h3> Customer ID : ${customer.CustomerId}</h3>`;
    build += `<div> First Name : ${customer.FirstName}</div>`;
    build += `<div> Last Name : ${customer.LastName}</div>`;
    build += `<p> Email : ${customer.Email}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }

  // Now inject the build content into the output container
  output.innerHTML = build;
  
}