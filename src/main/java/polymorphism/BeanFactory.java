package polymorphism;

public class BeanFactory {
	public Object getBean(String beanname) {
		if(beanname.equals("samsung")) {
			return new SamsungTv();
		} else if(beanname.equals("lg")) {
			return new LgTv();
		}
		return null;
	}
}
