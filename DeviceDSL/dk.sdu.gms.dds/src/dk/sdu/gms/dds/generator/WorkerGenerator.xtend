package dk.sdu.gms.dds.generator

import dk.sdu.gms.dds.deviceDefinition.Worker
import dk.sdu.gms.dds.deviceDefinition.Gateway

public class WorkerGenerator {
	
	public static def generateFunctionality(Worker worker) '''
	void begin () {
		Serial.begin(115200);
		
	}
	'''
	
	static def generateSamplingBegin (Worker worker) '''
	'''
	
	static def generateSamplingLoop (Worker worker) '''
	'''
	
	static def generateActuatingBegin (Worker worker) '''
	'''
	
	static def generateActuatingLoop (Worker worker) '''
	'''
	
	public static def generateNetworkingBegin () {
		
	}
	
	public static def generateNetworking (Worker worker) '''
	'''
	
	public static def gateway(Worker worker) {
		worker.eContainer as Gateway; 
	}
}