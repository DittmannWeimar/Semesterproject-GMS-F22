package dk.sdu.gms.dds

import dk.sdu.gms.dds.deviceDefinition.Gateway
import java.util.ArrayList
import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.deviceDefinition.Setting
import dk.sdu.gms.dds.deviceDefinition.Worker
import dk.sdu.gms.dds.deviceDefinition.Device

class Utils {
	
	public static def createSettingIndex (Gateway gateway) {
		val list = new ArrayList<String>();
		for (worker : gateway.workers) {
			val settingList = worker.settings;
			for (setting : settingList) {
				list.add(setting.fullyQualifiedName);
			}
		}
		return list;
	}
	
	public static def indexOfSetting(Setting setting) {
		return createSettingIndex(setting.device.worker.gateway).indexOf(setting.fullyQualifiedName);
	}
	
	public static dispatch def fullyQualifiedName (Setting setting) {
		setting.device.name + "-" + setting.name;
	}
	
	public static def settings(Worker worker) {
		val list = new ArrayList<Setting>();
		for (device : worker.devices) {
			if (device instanceof Sensor) {
				for (setting : device.settings) {
					list.add(setting);
				}
			}
			if (device instanceof Actuator) {
				for (setting : device.settings) {
					list.add(setting);
				}
			}
		}
		return list;
	}
	
	public static def device(Setting setting) {
		setting.eContainer as Device;
	}
	
	public static def worker(Device device) {
		device.eContainer as Worker;
	}
	
	public static def gateway(Worker worker) {
		worker.eContainer as Gateway; 
	}
	
	public static def system (Gateway gateway) {
		return gateway.eContainer as dk.sdu.gms.dds.deviceDefinition.System
	}
	
	public static def indexOf (Gateway gateway, Worker worker) {
		return gateway.workers.indexOf(worker);
	}
	
	public static def macAsBytes(String mac) {
		var bytes = mac.split(':');
		for (var i = 0; i < bytes.length; i++) {
			bytes.set(i, '0x' + bytes.get(i));
		}
		return bytes;
	}
}