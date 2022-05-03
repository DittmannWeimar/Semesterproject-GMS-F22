package dk.sdu.gms.dds;

import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.Gateway;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.Setting;
import dk.sdu.gms.dds.deviceDefinition.Worker;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class Utils {
  public static ArrayList<String> createSettingIndex(final Gateway gateway) {
    final ArrayList<String> list = new ArrayList<String>();
    EList<Worker> _workers = gateway.getWorkers();
    for (final Worker worker : _workers) {
      {
        final ArrayList<Setting> settingList = Utils.settings(worker);
        for (final Setting setting : settingList) {
          list.add(Utils.fullyQualifiedName(setting));
        }
      }
    }
    return list;
  }
  
  public static int indexOfSetting(final Setting setting) {
    return Utils.createSettingIndex(Utils.gateway(Utils.worker(Utils.device(setting)))).indexOf(Utils.fullyQualifiedName(setting));
  }
  
  public static String _fullyQualifiedName(final Setting setting) {
    String _name = Utils.device(setting).getName();
    String _plus = (_name + "-");
    String _name_1 = setting.getName();
    return (_plus + _name_1);
  }
  
  public static ArrayList<Setting> settings(final Worker worker) {
    final ArrayList<Setting> list = new ArrayList<Setting>();
    EList<Device> _devices = worker.getDevices();
    for (final Device device : _devices) {
      {
        if ((device instanceof Sensor)) {
          EList<Setting> _settings = ((Sensor)device).getSettings();
          for (final Setting setting : _settings) {
            list.add(setting);
          }
        }
        if ((device instanceof Actuator)) {
          EList<Setting> _settings_1 = ((Actuator)device).getSettings();
          for (final Setting setting_1 : _settings_1) {
            list.add(setting_1);
          }
        }
      }
    }
    return list;
  }
  
  public static Device device(final Setting setting) {
    EObject _eContainer = setting.eContainer();
    return ((Device) _eContainer);
  }
  
  public static Worker worker(final Device device) {
    EObject _eContainer = device.eContainer();
    return ((Worker) _eContainer);
  }
  
  public static Gateway gateway(final Worker worker) {
    EObject _eContainer = worker.eContainer();
    return ((Gateway) _eContainer);
  }
  
  public static dk.sdu.gms.dds.deviceDefinition.System system(final Gateway gateway) {
    EObject _eContainer = gateway.eContainer();
    return ((dk.sdu.gms.dds.deviceDefinition.System) _eContainer);
  }
  
  public static int indexOf(final Gateway gateway, final Worker worker) {
    return gateway.getWorkers().indexOf(worker);
  }
  
  public static String[] macAsBytes(final String mac) {
    String[] bytes = mac.split(":");
    for (int i = 0; (i < bytes.length); i++) {
      String _get = bytes[i];
      String _plus = ("0x" + _get);
      bytes[i] = _plus;
    }
    return bytes;
  }
  
  public static String fullyQualifiedName(final Setting setting) {
    return _fullyQualifiedName(setting);
  }
}
