package algorithm;

public class BasicCalculatorII227 {
	public int calculate(String s) {
		s += '+';
		char[] cs = s.toCharArray();
		int[] i = { -1 };
		return compute(cs, i, 0, '+');
	}

	public int compute(char[] cs, int[] i, int value, char op) {
		i[0]++;
		int num = 0;
		for (; i[0] < cs.length; i[0]++) {
			if (cs[i[0]] == ' ')
				continue;
			if (cs[i[0]] >= '0' && cs[i[0]] <= '9') {
				num = num * 10 + (cs[i[0]] - '0');
				continue;
			}
			if (cs[i[0]] == '-' || cs[i[0]] == '+') {
				switch (op) {
				case '*':
					return value * num;
				case '/':
					return value / num;
				default:
					value = comput(value, op, num);
					num = 0;
					op = cs[i[0]];
					break;
				}
			} else if (cs[i[0]] == '/' || cs[i[0]] == '*') {
				if (op == '+' | op == '-') {
					num = compute(cs, i, num, cs[i[0]]);
					i[0]--;
				} else {

					value = comput(value, op, num);
					num = 0;
					op = cs[i[0]];
				}
			}
		}
		return value;

	}

	public int comput(int a, char b, int c) {
		switch (b) {
		case '+':
			a += c;
			break;
		case '-':
			a -= c;
			break;
		case '/':
			a /= c;
			break;
		case '*':
			a *= c;
			break;
		default:
			break;
		}
		return a;
	}
}
