-- 코드를 입력하세요
SELECT ORDER_ID , PRODUCT_ID , DATE_FORMAT(OUT_DATE, "%Y-%m-%d") as OUT_DATE,
case
when (DATE_FORMAT(OUT_DATE , "%Y") <= 2022 and DATE_FORMAT(OUT_DATE , "%m") <= 4) or 
(DATE_FORMAT(OUT_DATE , "%Y") <= 2022 and DATE_FORMAT(OUT_DATE , "%m") = 5 and DATE_FORMAT(OUT_DATE , "%d") = 1)
then '출고완료' 
when DATE_FORMAT(OUT_DATE , "%Y") >= 2022 and DATE_FORMAT(OUT_DATE , "%m") >= 5 
then '출고대기' 
else '출고미정'
end as 출고여부 
from FOOD_ORDER 
order by ORDER_ID;