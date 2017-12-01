package topologicalsort;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseScheduleii {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];

        int[] course = new int[numCourses];
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

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < visited.length; i++)
            possible = possible && (dfs(visited, visiting, list, edgeList, i));

        if (!possible)
            return new int[0];

        for (int i = 0; i < list.size(); i++)
            course[i] = list.get(i);

        return course;
    }

    public boolean dfs(boolean[] visited, boolean[] visiting, ArrayList<Integer> list, HashMap<Integer, ArrayList<Integer>> edgeList, int index) {
        if (visited[index])
            return true;

        if (visiting[index])
            return false;


        visiting[index] = true;

        boolean value = true;
        if (edgeList.containsKey(index))
            for (Integer n : edgeList.get(index))
                value = value && dfs(visited, visiting, list, edgeList, n);

        list.add(index);

        visiting[index] = false;
        visited[index] = true;

        return value;
    }
}
