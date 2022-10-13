### 리눅스 명령어 요약
* * *
1. ls - 현재 위치의 파일 목록 조회  
2. cd - 디렉터리 이동  
3. touch - 0바이트 파일 생성, 파일의 날짜와 시간을 수정  
4. mkdir - 디렉터리 생성  
5. cp - 파일 복사  
6. mv - 파일 이동  
7. rm - 파일 삭제  
8. cat - 파일의 내용을 화면에 출력, 리다이렉션 기호('>')를 사용하여 새로운 파일 생성  
9. redirection - 화면의 출력 결과를 파일로 저장  
10. alias - 자주 사용하는 명령어들을 별명으로 정의하여 쉽게 사용할 수 있도록 설정  
11. head, tail - 파일 위(head) 아래(tail) 출력
   
   
  
1. ls (List segments) : 현재 위치의 파일 목록 조회  
ls -l : 파일의 상세정보  
ls -a : 숨김 파일 표시  
ls -t : 파일들을 생성시간순(제일 최신 것부터)으로 표시  
ls -rt : 파일들을 생성시간순(제일 오래된 것부터)으로 표시  
ls -f : 파일 표시 시 마지막 유형에 나타내는 파일명을 끝에 표시  
('/' : 디렉터리, '*' : 실행파일, '@' : 링크 등등,,,)  
   

2. cd (Change directory) :디렉터리 이동  
cd [디렉터리 경로] : 이동하려는 디렉터리로 이동 (경로 입력 시 '[', ']'부분은 빼고 입력!)  
cd ~ : 홈 디렉터리로 이동  
cd / : 최상위 디렉터리로 이동  
cd . : 현재 디렉터리   
cd .. : 상위 디렉터리로 이동  
cd - : 이전 경로로 이동  
   
  
3. touch : 0바이트 파일 생성, 파일의 날짜와 시간을 수정  
touch filename : filename의 파일을 생성  
touch -c filename : filename의 시간을 현재시간으로 갱신  
touch -t 202110291608 filename : filename의 시간을 날짜 정보(YYYYMMDDhhmm)로 갱신  
(20211029160 => 2021.10.29.16:08)  
touch -r oldfile newfile  : newfile의 날짜 정보를 oldfile의 날짜 정보와 동일하게 변경  
   
  
4. mkdir (Make dirctory) : 디렉터리 생성  
mkdir dirname : dirname이라는 디렉터리 생성  
mkdir dir1 dir2: 한 번에 여러 개의 디렉터리 생성  
mkdir -p dirname/sub_dirname : dirname이라는 디렉터리 생성, sub_dirname이라는 하위 디렉터리도 생성  
mkdir -m 700 dirname : 특정 퍼미션(권한)을 갖는 디렉터리 생성  
<파일의 퍼미션>
  
8진수	2진수	권한	의미  
0	000	---	아무 권한 없음  
1	001	--x	실행 권한만 있음  
2	010	-w-	쓰기 권한만 있음  
3	011	-wx	쓰기,실행 권한 있음  
4	100	r--	읽기 권한만 있음  
5	101	r-x	쓰기,실행 권한 있음  
6	110	rw-	읽기,쓰기 권한 있음  
7	111	rwx	모든 권한 있음  
예를 들어 '777'의 경우 이진수로 111111111이고 rwxrwxrwx라는 의미를 가지므로 파일 소유자, 소유 그룹, 일반 사용자에게 읽기, 쓰기, 실행의 모든 권한을 주는 설정이다.  

 

5. cp (Copy) : 파일 복사  
cp file1 file2 : file1을 file2라는 이름으로 복사  
cp -f file1 file2 : 강제 복사(file2라는 파일이 이미 있을 경우 강제로 기존 file2를 지우고 복사 진행)  
cp -r dir1 dir2 : 디렉터리 복사. 폴더 안의 모든 하위 경로와 파일들을 복사  
   
  
6. mv (Move) : 파일 이동  
mv file1 file2 : file1 파일을 file2 파일로 변경  
mv file1 /dir : file1 파일을 dir 디렉터리로 이동  
mv file1 file2 /dir : 여러 개의 파일을 dir 디렉터리로 이동  
mv /dir1 /dir2 : dir1 디렉터리를 dir2 디렉터리로 이름 변경  
 

7. rm (Remove) : 파일 삭제  
rm file1 : file1을 삭제  
rm -f file1 : file1을 강제 삭제  
rm -r dir : dir 디렉터리 삭제 (디렉터리는 -r 옵션 없이 삭제 불가)  
 

8. cat (Catenate) : 파일의 내용을 화면에 출력, 리다이렉션 기호('>')를 사용하여 새로운 파일 생성  
cat file1 : file1의 내용을 출력  
cat file1 file2 : file1과 file2의 내용을 출력  
cat file1 file2 | more : file1과 file2의 내용을 페이지별로 출력  
cat file1 file2 | head : file1과 file2의 내용을 처음부터 10번째 줄까지만 출력  
cat file1 file2 | tail : file1과 file2의 내용을 끝에서부터 10번째 줄까지만 출력  
 

9. redirection ('>', '>>') : 화면의 출력 결과를 파일로 저장  
'>' 기호 : 기존에 있는 파일 내용을 지우고 저장  
'>>' 기호 : 기존 파일 내용 뒤에 덧붙여서 저장  
'<' 기호 : 파일의 데이터를 명령에 입력  
  
cat file1 firle2 > file3 : file1, file2의 명령 결과를 합쳐서 file3라는 파일에 저장 
car file4 >> file3 : file3에 file4의 내용 추가  
cat < file1 : file1의 결과 출력  
cat < file1 > file2 : file1의 출력 결과를 file2에 저장    

11.   -# head, tail 자주 사용하는 옵션
head ./test.log #기본적으로 위(첫줄부터)에서부터 10줄까지 보여줌
head -n 5 ./test.log #위에서부터 5줄
head -n -5 ./test.log #밑에서부터 5줄뺀 나머지 출력
cat ./test.log | head -n 5 #cat명령어 조합으로 사용

#자주 사용되는 옵션  
$tail -n 10 ./test.log #아래서부터 위로 10줄 출력  
$tail -n +5 ./test.log #5번째 줄부터 끝까지 출력  
$tail -f ./test.log #추가되는 내용 append하여 출력됨  