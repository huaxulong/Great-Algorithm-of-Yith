package com.duanxr.yith.easy;

/**
 * @author Duanran 2019/1/17 0017
 */
public class DuplicateEmails {

  /**
   * Write a SQL query to find all duplicate emails in a table named Person.
   *
   *+----+---------+
   *| Id | Email   |
   *+----+---------+
   *| 1  | a@b.com |
   *| 2  | c@d.com |
   *| 3  | a@b.com |
   *+----+---------+
   *
   *For example, your query should return the following for the above table:
   *
   *+---------+
   *| Email   |
   *+---------+
   *| a@b.com |
   *+---------+
   *
   *Note: All emails are in lowercase.
   *
   *编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。
   *
   *示例：
   *
   *+----+---------+
   *| Id | Email   |
   *+----+---------+
   *| 1  | a@b.com |
   *| 2  | c@d.com |
   *| 3  | a@b.com |
   *+----+---------+
   *
   *根据以上输入，你的查询应返回以下结果：
   *
   *+---------+
   *| Email   |
   *+---------+
   *| a@b.com |
   *+---------+
   *
   *说明：所有电子邮箱都是小写字母。
   */
  String sql = "select Email from Person group by Email having count(Email) > 1";
}
