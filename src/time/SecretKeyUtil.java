package time;

import java.security.PublicKey;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;
/*
 * 获取云点播的参数sign
 */
public class SecretKeyUtil {
public static String getSign(Map<String, String>map,String secretKey){

Set<String> keySet = map.keySet();
	String keys="";
	for (String key : keySet) {
		keys+=key+map.get(key);
	}
	keys+=secretKey;
MD5 md5=new MD5();
		return md5.getMD5ofStr(keys).toLowerCase();
}
}