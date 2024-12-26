-- 코드를 입력하세요
SELECT 
    ANIMAL_ID,
    NAME
FROM (
    SELECT
    i.ANIMAL_ID,
    o.NAME,
    o.DATETIME - i.DATETIME AS 'test'
    FROM ANIMAL_INS i
    INNER JOIN ANIMAL_OUTS o ON i.ANIMAL_ID = o.ANIMAL_ID
    ORDER BY test DESC
    LIMIT 2
      ) AS NT


