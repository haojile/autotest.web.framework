/**
 * http://surenpi.com
 */
package org.suren.autotest.web.framework.core.suite;

/**
 * 测试套件中的动作定义
 * @author suren
 * @date 2016年9月7日 下午10:00:49
 */
public class SuiteAction
{
	/** 属性名 */
	private String field;
	/** 动作名 */
	private String name;
	/** 操作前休眠时间 */
	private long beforeSleep;
	/** 操作后休眠时间 */
	private long afterSleep;
	/** 重复次数 */
	private int repeat;
	public SuiteAction(){}
	/**
	 * @param field
	 * @param name
	 */
	public SuiteAction(String field, String name)
	{
		this.field = field;
		this.name = name;
	}
	/**
	 * @return the field
	 */
	public String getField()
	{
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field)
	{
		this.field = field;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the beforeSleep
	 */
	public long getBeforeSleep()
	{
		return beforeSleep;
	}
	/**
	 * @param beforeSleep the beforeSleep to set
	 */
	public void setBeforeSleep(long beforeSleep)
	{
		this.beforeSleep = beforeSleep;
	}
	/**
	 * @return the afterSleep
	 */
	public long getAfterSleep()
	{
		return afterSleep;
	}
	/**
	 * @param afterSleep the afterSleep to set
	 */
	public void setAfterSleep(long afterSleep)
	{
		this.afterSleep = afterSleep;
	}
	/**
	 * @return the repeat
	 */
	public int getRepeat()
	{
		return repeat;
	}
	/**
	 * @param repeat the repeat to set
	 */
	public void setRepeat(int repeat)
	{
		this.repeat = repeat;
	}
}
