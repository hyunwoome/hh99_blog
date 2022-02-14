# hh99 blog server

## API

#### 게시글 (/api/posts)

| NO  | URL  | METHOD |         BODY         | RETURN |     DESC     |
|:---:|:----:|:------:|:--------------------:|:------:|:------------:|
|  1  |  /   |  GET   |                      |        | 전체 게시글 목록 조회 |
|  2  |  /   |  POST  |   제목, 작성자명, 작성 내용    |        |    게시글 작성    |
|  3  | /:id |  GET   |          ID          |        |  특정 게시글 조회   |
|  4  | /:id |  PUT   | 제목, 작성자명, 작성 내용 중 하나 |        |  특정 게시글 수정   |
|  5  | /:id | DELETE |          ID          |        |  특정 게시글 삭제   |  

#### 댓글 (/api/comments)

| NO  | URL  | METHOD |    BODY     | RETURN |   DESC   |
|:---:|:----:|:------:|:-----------:|:------:|:--------:|
|  1  |  /   |  GET   |     ID      |        | 댓글 목록 조회 |
|  2  |  /   |  POST  | 작성자명, 작성 내용 |        |  댓글 작성   |
|  3  | /:id |  PUT   |    작성 내용    |        |  댓글 수정   |
|  4  | /:id | DELETE |     ID      |        |  댓글 삭제   |


<br/>

## DB Modeling

#### posts

- [String] 제목
- [String] 작성 내용
- [String] 작성자명(임시)
- [Date] 작성 날짜
- [Date] 수정 날짜

#### comments

- [String] 작성자명(임시)
- [String] 작성 내용
- [Date] 작성 날짜
- [Date] 수정 날짜