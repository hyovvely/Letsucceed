```css
* {
    margin: 0; padding: 0;
    font-family: '맑은 고딕', Malgun Gothic, sans-serif;
}

a {
    text-decoration: none;
}

li {
    list-style: none;
}

/* 기본 클래스 */
.pull-left {float:left;} /* HTML5 개요와 활용 이미지(430x280) 왼쪽으로 이동 */
.pull-right {float:right;} /* searchbar 검색 오른쪽으로 이동 */

body {
    width: 960px; margin: 0 auto;  /* margin: 0 auto -> 전체적인 페이지 가운데로이동? */
    background: #E6E6E6;
}

#HTML-page-wrapper{
    background: white;
    margin: 40px 0; padding: 10px 20px; /* 전체 페이지 중앙 맞추기 */
    border-radius: 5px; /* 페이지 전체 테두리 */
    box-shadow: 0 2px 6px rgb(100, 100, 100, 0.3); /* 페이지 전체 테두리 쉐도우 넣기 */
}

#main-header {
    padding: 40px 50px; /* HTML5 Example Preview 제목 중앙로 정렬 */
}

.master-title {
    font-size: 30px; /* Example Preview 글씨 크기 줄이기 */
    color: #181818;
}

.master-description {
    font-size: 15px; font-weight: 500;
    color: #383838;
}

#main-navigation {
    border-top: 1px solid #C8C8C8; /* navbar 위에 한줄 긋기 */
    border-bottom: 1px solid #C8C8C8; /* navbar 밑에 한줄 긋기 */
    margin-bottom: 20px;
    height: 40px;
}

.outer-menu-item {
    float: left; /* 메뉴바 왼쪽 HTML5 CSS3 JavaScript */
    position: relative; /* static 위치를 기준으로 계산 */
}

.outer-menu-item:hover{
    background: black; /* 메뉴바 클릭시 검정색 */
    color: white;
}

.menu-title {
    display: block;
    height: 30px; line-height: 30px;
    text-align: center;
    padding: 5px 20px;
}

.inner-menu {
    display: none; /* 메뉴 항목 (데이터 나열한거) 숨기기 */
    position: absolute;
    top: 40px; left: 0;
    width: 100%;
    background: white;
    box-shadow: 0 2px 6px rgba(5, 5, 5, 0.9);
    z-index: 1000;
    text-align: center;
}

.inner-menu-item > a {
    display: block;
    padding: 5px 10px;
    color: black;
}

.inner-menu-item > a:hover {
    background: black;
    color: white;
}

.search-bar {
    height: 26px;
    padding: 7px;
}

.input-search {
    display: block;
    float: left;
    background-color: #FFFFFF;
    border: 1px solid #CCCCCC;
    border-radius: 15px 0 0 15px;
    box-shadow: inset 0 1px 1px rgba(0,0,0,0.05);
    width: 120px; height: 24px;
    padding: 0 0 0 10px;
    font-size: 12px;
    color: #555555;
}
.input-search:focus { /* 검색창 클릭했을 때 색 변경 */
    border-color: rgba(82, 168, 236, 0.8);
    outline: 0;
    box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);
}
.input-search-submit { /* 검색 모양 */
    display: block;
    float: left;
    width: 50px; height: 26px;
    border-radius: 0 15px 15px 0;
    border: 1px solid #CCCCCC;
    margin-left: -1px;
    vertical-align: top;
    display: inline-block;
}

#content { 
   overflow: hidden;
}

#main-section { /* 카테고리 최근 글 오른 쪽에 옮기기 */
    float: left;
    width: 710px;
}

#main-aside {
    float: right;
    width: 200px;
}

article {
    padding: 0 10px 20px 10px;
    border-bottom: 1px soild #C8C8C8;
}

.article-header {
    padding: 20px 0;
}

.article-title {
    font-size: 25px;
    font-weight: 500;
    padding-bottom: 10px;
}

.article-date {
    font-size: 13px;
}

.article-body {
    font-size: 14px;
}

.aside-list { 
    padding: 10px 0 30px 0;
}
.aside-list > h3 {
    font-size: 15px;
    font-weight: 600;
}
.aside-list li a {
    margin-left: 8px;
}
.aside-list li a {
    margin-left: 8px;
    font-size: 13px;
    color: #6C6C6C;
}
```
