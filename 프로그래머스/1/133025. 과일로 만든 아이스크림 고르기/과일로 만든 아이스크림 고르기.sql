-- 코드를 입력하세요
SELECT ICECREAM_INFO.flavor from ICECREAM_INFO Inner Join FIRST_HALF on FIRST_HALF.flavor = ICECREAM_INFO.flavor
where TOTAL_ORDER > 3000 and INGREDIENT_TYPE = "fruit_based" order by TOTAL_ORDER desc