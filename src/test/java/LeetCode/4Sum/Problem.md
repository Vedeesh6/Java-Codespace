<h2><a href="https://leetcode.com/problems/4sum/">18. 4Sum</a></h2><h3>Medium</h3><hr><div><p>Given an array nums of n integers, return an array of all the unique quadruplets <code>[nums[a], nums[b], nums[c], nums[d]] </code>such that 
<ul>
	<li><code>0 &lt;= a, b, c, d &lt; n</code></li>
	<li><code>a, b, c, </code>and <code>d </code>are <strong>distinct. </strong></li>
	<li><code>nums[a] + nums[b] + nums[c] + nums[d] == target</code></li>
</ul>
<p>You may return answer in <strong>any order</strong></p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,0,-1,0,-2,2], target = 0
<strong>Output:</strong> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [2,2,2,2,2], target = 8
<strong>Output:</strong> [[2,2,2,2]]
<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 200</code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
</ul>