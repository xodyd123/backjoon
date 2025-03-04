SELECT 
    Warehouse_ID, 
    Warehouse_Name, 
    Address, 
    COALESCE(FREEZER_YN, 'N') 
FROM 
    FOOD_WAREHOUSE
WHERE 
    Address LIKE '%경기%'  -- 경기도에 위치한 창고를 찾기 위한 조건
ORDER BY 
    Warehouse_ID ASC;  -- 창고 ID 기준으로 오름차순 정렬
