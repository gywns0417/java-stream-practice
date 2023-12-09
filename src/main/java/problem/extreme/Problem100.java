package problem.extreme;

import java.util.List;
import java.util.Map;
import problem.extreme.resources.Employee;
import problem.extreme.resources.Project;

public class Problem100 {

    /**
     * 주어진 직원 리스트에서 각 직원의 프로젝트별 성과를 복합적인 기준으로 분석합니다. 
     * 이 분석은 다음과 같은 여러 요소를 포함합니다:
     * 
     * 1. 프로젝트 지속 기간: 프로젝트 시작부터 종료까지의 총 일수.
     * 2. 직원의 프로젝트 참여 기간: 각 직원이 프로젝트에 참여한 총 일수.
     * 3. 부서별 참여 비율: 프로젝트에 참여한 각 부서의 직원들 중, 해당 직원의 참여 비율.
     * 4. 직원의 근무 경력: 직원의 총 근무 연수.
     * 
     * 결과는 프로젝트를 키로 하고, 각 프로젝트에 참여한 직원별로 성과 지표를 담은 Map으로 반환합니다.
     * 각 성과 지표는 프로젝트 지속 기간, 참여 기간, 부서별 참여 비율, 근무 경력 등을 포함합니다.
     *
     * @param employees 직원 리스트
     * @return 프로젝트별 직원의 성과 지표
     */
    public static Map<Project, Map<Employee, Map<String, Object>>> analyzeEmployeePerformanceByProject(List<Employee> employees) {
        // 여기에 코드 작성
        return null;
    }
}
