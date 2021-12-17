select `order`.oID, `order`.oDate, `order`.oTotalPrice from `order`;
select customer.cID, customer.name,product.pName, orderdetail.odQTY
from customer
	inner join `order`
    on customer.cID = `order`.cID
    inner join orderdetail
    on `order`.oID = orderdetail.oID
    inner join product
    on orderdetail.pID = product.pID;
    
select customer.name, customer.cID
from customer
	where customer.cID not in (select `order`.cID from `order`);

select `order`.oID, `order`.oDate, `order`.oTotalPrice = product.pPrice * orderdetail.odQTY
from `order`
	inner join product
    on `order`.cID = product.pID
    inner join orderdetail
    on product.pID = orderdetail.pID;
	