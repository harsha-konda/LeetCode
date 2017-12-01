package topologicalsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if (numCourses == 0) return false;

        HashMap<Integer, ArrayList<Integer>> edgeList = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            Integer key = prerequisites[i][0];
            Integer value = prerequisites[i][1];
            if (edgeList.containsKey(key))
                edgeList.get(key).add(value);
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                edgeList.put(key, list);
            }
        }


        boolean[] visited = new boolean[numCourses];
        boolean[] visiting = new boolean[numCourses];
        boolean possible = true;

        for (int i = 0; i < visited.length; i++)
            possible = possible && (dfs(visited, visiting, edgeList, i));

        return possible;
    }

    public boolean dfs(boolean[] visited, boolean[] visiting, HashMap<Integer, ArrayList<Integer>> edgeList, int index) {
        if (visited[index])
            return true;

        if (visiting[index])
            return false;


        visiting[index] = true;

        boolean value = true;
        if (edgeList.containsKey(index))
            for (Integer n : edgeList.get(index))
                value = value && dfs(visited, visiting, edgeList, n);

        visiting[index] = false;
        visited[index] = true;

        return value;
    }
}
