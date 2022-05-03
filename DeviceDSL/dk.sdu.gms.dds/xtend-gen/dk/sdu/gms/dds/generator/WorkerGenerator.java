package dk.sdu.gms.dds.generator;

import dk.sdu.gms.dds.deviceDefinition.Gateway;
import dk.sdu.gms.dds.deviceDefinition.Worker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class WorkerGenerator {
  public static CharSequence generateFunctionality(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void begin () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Serial.begin(115200);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generateSamplingBegin(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence generateSamplingLoop(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence generateActuatingBegin(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence generateActuatingLoop(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static Object generateNetworkingBegin() {
    return null;
  }
  
  public static CharSequence generateNetworking(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static Gateway gateway(final Worker worker) {
    EObject _eContainer = worker.eContainer();
    return ((Gateway) _eContainer);
  }
}
