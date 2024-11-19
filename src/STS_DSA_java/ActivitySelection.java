package STS_DSA_java;

import java.util.*;

class Activity implements Comparable<Activity> {
    int start, finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public int compareTo(Activity other) {
        return this.finish - other.finish;
    }
}

public class ActivitySelection {

    public static List<Activity> selectActivities(List<Activity> activities) {
        Collections.sort(activities);

        List<Activity> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities.get(0));

        for (int i = 1, j = 0; i < activities.size(); i++) {
            if (activities.get(i).start >= activities.get(j).finish) {
                selectedActivities.add(activities.get(i));
                j = i;
            }
        }

        return selectedActivities;
    }

    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 4));
        activities.add(new Activity(3, 5));
        activities.add(new Activity(0, 6));
        activities.add(new Activity(5, 7));
        activities.add(new Activity(3, 8));
        activities.add(new Activity(5, 9));
        activities.add(new Activity(6, 10));
        activities.add(new Activity(8, 11));
        activities.add(new Activity(8, 12));
        activities.add(new Activity(2, 13));
        activities.add(new Activity(12, 14));

        List<Activity> selectedActivities = selectActivities(activities);

        System.out.println("Selected Activities:");
        for (Activity activity : selectedActivities) {
            System.out.println("Start: " + activity.start + ", Finish: " + activity.finish);
        }
    }
}

