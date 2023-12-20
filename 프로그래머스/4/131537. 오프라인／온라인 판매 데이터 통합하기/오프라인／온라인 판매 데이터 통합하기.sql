-- 아래 조건은 where 절에 들어갈 값
# SELECT PRODUCT_ID FROM ONLINE_SALE  
# GROUP BY SALES_DATE
# UNION ALL 
# SELECT PRODUCT_ID FROM OFFLINE_SALE 
# GROUP BY SALES_DATE

SELECT DATE_FORMAT(ct.SALES_DATE,'%Y-%m-%d') as SALES_DATE ,ct.PRODUCT_ID,ct.USER_ID, ct.SALES_AMOUNT 
FROM
(
SELECT SALES_DATE,PRODUCT_ID,USER_ID, SALES_AMOUNT 
FROM ONLINE_SALE 
WHERE SALES_DATE LIKE('2022-03%')
UNION ALL
SELECT os.SALES_DATE,
       os.PRODUCT_ID,
       (
         SELECT NULL
         FROM OFFLINE_SALE ios
         WHERE ios.OFFLINE_SALE_ID	 = os.OFFLINE_SALE_ID  
       ) as USER_ID,
       os.SALES_AMOUNT 
FROM OFFLINE_SALE  os
WHERE SALES_DATE LIKE('2022-03%')
) ct
ORDER BY ct.SALES_DATE,ct.PRODUCT_ID,ct.USER_ID


