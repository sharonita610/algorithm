import java.util.*;

class Solution {
   public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Job> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            queue.add(Job.of(i, progress, speed));
        }

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int count = 0;
            Job curr = queue.peek();
            assert curr != null;

            if (curr.timeToFinish == 0) {
                queue.poll();
                count++;

                while (true) {
                    Job next = queue.peek();
                    if (next == null || next.timeToFinish != 0) {
                        break;
                    } else {
                        queue.poll();
                        count++;
                    }
                }
                result.add(count);
            }

            for (Job job : queue) {
                job.decreaseTimeToFinish();
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Job {
        int startIndex;
        int timeToFinish;

        public Job(int startIndex, int timeToFinish) {
            this.startIndex = startIndex;
            this.timeToFinish = timeToFinish;
        }

        public static Job of(int startIndex, int progress, int speed) {
            double jobToFinish = (double) (100 - progress) / speed;
            return new Job(startIndex, (int)Math.ceil(jobToFinish));
        }

        public void decreaseTimeToFinish() {
            if (this.timeToFinish > 0) {
                this.timeToFinish--;
            }
        }
    }
}
