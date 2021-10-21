function main() {
  document.getElementById("listProduct").innerHTML += showProduct(product);
}
let product = [
  "Sony",
  "Samsung",
  "Iphone",
  "Nokia",
  "Motorola",
  "Blackberry",
  "Xiaomi",
];
main();
function showProduct(array) {
  table = document.getElementById("listProduct").innerHTML;
  for (let i = 0; i < array.length; i++) {
    if (i % 2 != 0) {
      table += `<tr style="background-color: #dddddd;">`;
    } else {
      table += `<tr>`;
    }
    table += `<td>${array[i]}</td>
        <td><button onclick= 'editProduct(${i})'>Edit</button></td>
        <td><button onclick= 'deleteProduct(${i})'>Delete</button></td>
        <tr id="hiddenRow${i}" style= "display: none"><td><input type="text" id=txtEdit${i}></td>
        <td><button onclick= "okEdit(${i})">Ok</button></td>
        <td><button onclick= "cancelEdit(${i})">Cancel</button></td>
        </tr>`;

    table += "</tr>";
  }
  return table;
}
function deleteProduct(number) {
  product.splice(number, 1);
  document.getElementById("listProduct").innerHTML = `<table id="listProduct">`;
  main();
}
function editProduct(number) {
  // document.getElementById(`txtEdit${number}`).style.display= "block";
  // document.getElementById(`btnEdit${number}`).style.display= "block";
  document.getElementById(`hiddenRow${number}`).style.removeProperty("display");
}
function okEdit(number) {
  let newValue = document.getElementById(`txtEdit${number}`).value;
  if (newValue == "") {
    alert("Vui lòng nhập tên cần sửa");
  } else {
    product.splice(number, 1, newValue);
    document.getElementById(
      "listProduct"
    ).innerHTML = `<table id="listProduct">`;
    main();
  }
}
function cancelEdit(number) {
  document.getElementById(`hiddenRow${number}`).style.display = "none";
}
function addNewProduct() {
  let newProduct = document.getElementById("addProduct").value;
  let check = product.includes(newProduct);
  if (newProduct == "") {
    alert("Vui lòng nhập tên sản phẩm cần thêm");
  } else if (check) {
    alert("Sản phẩm này đã tồn tại");
  } else {
    product.push(newProduct);
    document.getElementById(
      "listProduct"
    ).innerHTML = `<table id="listProduct">`;
    main();
  }
}
