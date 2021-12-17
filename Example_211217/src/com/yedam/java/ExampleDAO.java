package com.yedam.java;

import java.util.List;

public interface ExampleDAO {

	// 1. 급여정보가 5000~10000 사이인 사원의 리스트 출력
	// 사원번호, 이름, 이메일, 급여정보 출력
	List<Example> select1();

	// 2. 사원직책이 ST_CLERK인 사람들 중에서 급여가 가장 높은 사원의 급여출력
	// 없을경우에도 에러없이 출력되도록 구현
	List<Example> select2();

	// 3. 입사일이 5월달인 사람들의 평균 급여를 출력
	// 없을경우에도 에러없이 출력되도록 구현
	List<Example> select3();

	// 4. 직책이 SA_REP인 사원 중 급여가 10000 이상인 사람들의
	// 사원번호, 이름, 이메일, 급여정보를 출력
	List<Example> select4();

}