DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(250) NOT NULL,
  Category VARCHAR(250) NOT NULL
);

INSERT INTO Book (Name, Category) VALUES
  ('Clean code', 'Software Development'),
  ('Clean architecture', 'Software Development'),
  ('4 Rules of Simple Design', 'Software Development');
