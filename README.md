# hh99 blog server

## API

#### 게시글 (/api/posts)

| NO  | URL  | METHOD |                BODY                 | RETURN |   DESC    |
|:---:|:----:|:------:|:-----------------------------------:|:------:|:---------:|
|  1  |  /   |  GET   |                                     | 전체 게시글 | 전체 게시글 조회 |
|  2  |  /   |  POST  |        name, title, content         |  게시글   |  게시글 작성   |
|  3  | /:id |  GET   |                                     |  게시글   | 특정 게시글 조회 |
|  4  | /:id |  PUT   |        name, title, content         |  게시글   |  게시글 수정   |
|  5  | /:id | DELETE |                                     |   ID   |  게시글 삭제   |  

#### 댓글 (/api/comments)

| NO  |   URL    | METHOD |                  BODY                  | RETURN |       DESC        |
|:---:|:--------:|:------:|:--------------------------------------:|:------:|:-----------------:|
|  1  | /:postId |  GET   |                                        |   댓글   | 해당 아이디의 포스트 댓글 조회 |
|  2  |    /     |  POST  |         postId, name, content          |   댓글   |       댓글 작성       |
|  3  |   /:id   |  PUT   |         postId, name, content          |   댓글   |       댓글 수정       |
|  4  |   /:id   | DELETE |                                        |   ID   |       댓글 삭제       |

<br/>

## Domain

#### posts

- [String] 이름
- [String] 제목
- [String] 작성 내용
- [Date] 작성 날짜
- [Date] 수정 날짜

#### comments

- [Long] 게시글 ID
- [String] 이름
- [String] 작성 내용
- [Date] 작성 날짜
- [Date] 수정 날짜