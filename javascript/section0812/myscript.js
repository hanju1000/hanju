/* myscript. js */

function hap(a, b) {    //두수사이의 합을 반환하시오
    //2+3+4+5
    //5+4+3+2
    if(a+b){
        let tmp=a; a=b; b=tmp; 
    }//if end

    let sum=0;
    for(let n=a; n<=b; n++){
        sum += n;
    }//for end

    return sum;

}//hap() end

function diff(a, b) {   //두수사이의 차이를 반환하시오  (절대값 사용)
    //2, 5
    //5, 2
    return Math.abs(a-b);

}//diff() end

function leap(y) {   //윤년 평년을 반환하시오
       if(y% 4==0 && y%100!= 0 || y%400==0){       //윤년인지?
            return true;
        }else{
            return false;
        }//if end
}//leap() end
