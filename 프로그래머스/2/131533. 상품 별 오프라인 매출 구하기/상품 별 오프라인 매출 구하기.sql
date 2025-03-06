-- 코드를 입력하세요
SELECT  product_code , sum(SALES_AMOUNT * PRICE) as SALES
from PRODUCT inner join OFFLINE_SALE on PRODUCT.PRODUCT_ID = OFFLINE_SALE.PRODUCT_ID 
group by product_code
order by SALES DESC , PRODUCT_CODE ASC ;

