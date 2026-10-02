
class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> list = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("C")) {
                list.remove(list.size() - 1);
            }

            else if (op.equals("D")) {
                int last = list.get(list.size() - 1);
                list.add(last * 2);
            }

            else if (op.equals("+")) {
                int n = list.size();

                int sum = list.get(n - 1) + list.get(n - 2);
                list.add(sum);
            }

            else {
                list.add(Integer.parseInt(op));
            }
        }

        int total = 0;

        for (int score : list) {
            total += score;
        }

        return total;
    }
}