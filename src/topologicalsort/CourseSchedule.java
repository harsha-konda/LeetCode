package topologicalsort;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if (numCourses == 0) return false;

        List<Integer>[] edgeList = new ArrayList[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            if (edgeList[prerequisites[i][1]] == null) {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][0]);
                edgeList[prerequisites[i][1]] = list;
            } else {
                edgeList[prerequisites[i][1]].add(prerequisites[i][0]);
            }
        }


        boolean[] visited = new boolean[numCourses];

        return dfs(visited, edgeList, 0);
    }

    public boolean dfs(boolean[] visited, List<Integer>[] edgeList, int index) {
        if (visited[index]) return false;

        visited[index] = true;

        boolean result = true;
        for (int i = 0; i < edgeList[index].size(); i++) {
            result = result && dfs(visited, edgeList, index);
        }
        return result;
    }

}
