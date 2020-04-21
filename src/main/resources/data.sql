insert into bank_account(id, name, balanceamount, accountnumber, cardnumber, cvvnumber, expirydate) values (1,'Sridevi',10000.00,111111111111,1212121212121212,123,sysdate);
insert into bank_account(id, name, balanceamount, accountnumber, cardnumber, cvvnumber, expirydate) values (2,'HungerBox',10000.00,222222222222,2323232323232323,446,sysdate);

insert into bank_transaction(id ,fromacct,toacct,amounttransfered, dateoftransfer) values(1,111111111111,222222222222,1000.00,sysdate);