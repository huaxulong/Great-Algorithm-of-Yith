package com.duanxr.yith.easy;

/**
 * @author Duanran 2019/1/24 0024
 */
public class LicenseKeyFormatting {

  /**
   * You are given a license key represented as a string S which consists only alphanumeric
   * character and dashes. The string is separated into N+1 groups by N dashes.
   *
   * Given a number K, we would want to reformat the strings such that each group contains exactly K
   * characters, except for the first group which could be shorter than K, but still must contain at
   * least one character. Furthermore, there must be a dash inserted between two groups and all
   * lowercase letters should be converted to uppercase.
   *
   * Given a non-empty string S and a number K, format the string according to the rules described
   * above.
   *
   * Example 1:
   *
   * Input: S = "5F3Z-2e-9-w", K = 4
   *
   * Output: "5F3Z-2E9W"
   *
   * Explanation: The string S has been split into two parts, each part has 4 characters.
   *
   * Note that the two extra dashes are not needed and can be removed.
   *
   * Example 2:
   *
   * Input: S = "2-5g-3-J", K = 2
   *
   * Output: "2-5G-3J"
   *
   * Explanation: The string S has been split into three parts, each part has 2 characters except
   * the first part as it could be shorter as mentioned above.
   *
   * Note:
   *
   * The length of string S will not exceed 12,000, and K is a positive integer.
   *
   * String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
   *
   * String S is non-empty.
   *
   * 给定一个密钥字符串S，只包含字母，数字以及 '-'（破折号）。N 个 '-' 将字符串分成了 N+1 组。给定一个数字 K，重新格式化字符串，除了第一个分组以外，每个分组要包含 K
   * 个字符，第一个分组至少要包含 1 个字符。两个分组之间用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
   *
   * 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
   *
   * 示例 1：
   *
   * 输入：S = "5F3Z-2e-9-w", K = 4
   *
   * 输出："5F3Z-2E9W"
   *
   * 解释：字符串 S 被分成了两个部分，每部分 4 个字符；
   *
   * 注意，两个额外的破折号需要删掉。
   *
   * 示例 2：
   *
   * 输入：S = "2-5g-3-J", K = 2
   *
   * 输出："2-5G-3J"
   *
   * 解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
   *
   *
   * 提示:
   *
   * S 的长度不超过 12,000，K 为正整数
   *
   * S 只包含字母数字（a-z，A-Z，0-9）以及破折号'-'
   *
   * S 非空
   */
  class Solution {

    public String licenseKeyFormatting(String S, int K) {
      StringBuilder sb = new StringBuilder();
      int count = 0;
      K++;
      for (int i = S.length() - 1; i >= 0; i--) {
        char c = S.charAt(i);
        if (c != '-') {
          count++;
          if (count == K) {
            sb.append('-');
            count = 1;
          }
          sb.append(Character.toUpperCase(c));
        }
      }
      return sb.reverse().toString();
    }
  }
}
