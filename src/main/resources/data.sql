INSERT INTO PRIVILEGE (id, name)
SELECT id, name
FROM (VALUES (123, 'edit'), (222, 'delete'), (333, 'add')) AS tmp(id, name)
WHERE NOT EXISTS (
    SELECT 1
    FROM PRIVILEGE
    WHERE PRIVILEGE.id = tmp.id
);