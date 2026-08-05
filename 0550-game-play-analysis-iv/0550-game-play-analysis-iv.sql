/* Write your T-SQL query statement below */
WITH first_login AS (
    SELECT
        player_id,
        MIN(event_date) AS first_date
    FROM Activity
    GROUP BY player_id
)

SELECT
    ROUND(
        CAST(COUNT(*) AS FLOAT) /
        (SELECT COUNT(*) FROM first_login),
        2
    ) AS fraction
FROM first_login f
JOIN Activity a
    ON f.player_id = a.player_id
WHERE a.event_date = DATEADD(DAY, 1, f.first_date);