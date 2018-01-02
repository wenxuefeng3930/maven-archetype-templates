package wang.raye.springboot.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import wang.raye.springboot.model.User;
import wang.raye.springboot.model.UserCriteria;

public interface UserMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "countByExample")
	long countByExample(UserCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@DeleteProvider(type = UserSqlProvider.class, method = "deleteByExample")
	int deleteByExample(UserCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@Delete({ "delete from user", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@Insert({ "insert into user (id, username, ", "psw)",
			"values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
			"#{psw,jdbcType=VARCHAR})" })
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "psw", property = "psw", jdbcType = JdbcType.VARCHAR) })
	List<User> selectByExample(UserCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@Select({ "select", "id, username, psw", "from user",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "psw", property = "psw", jdbcType = JdbcType.VARCHAR) })
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") User record,
			@Param("example") UserCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table user
	 *
	 * @mbg.generated
	 */
	@Update({ "update user", "set username = #{username,jdbcType=VARCHAR},",
			"psw = #{psw,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(User record);
}