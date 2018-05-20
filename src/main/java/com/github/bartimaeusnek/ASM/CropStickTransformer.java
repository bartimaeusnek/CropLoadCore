package com.github.bartimaeusnek.ASM;


import java.util.Arrays;
import java.util.List;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

import net.minecraft.launchwrapper.IClassTransformer;

public class CropStickTransformer implements IClassTransformer {

	private final static String[] classesBeeingTransformed= 
		{
				"ic2.core.crop.BlockCrop"
		};
	private final static String[] methodesBeeingTransformed= 
		{
				"canPlaceBlockAt"
		};
	
	@Override
	public byte[] transform(String name, String transformedName, byte[] basicClass) {
		boolean isObfuscated = !name.equals(transformedName);
		int index = Arrays.asList(classesBeeingTransformed).indexOf(transformedName);
		
		byte[] patch1 = index != (-1) ? transform(index,0,basicClass,isObfuscated):basicClass;
		
		return index != (-1) ? transform(index,1,patch1,isObfuscated):patch1;
	}

	private byte[] transform(int index,int method,byte[] basicClass, boolean isObfuscated) {
		try {
			switch (index) {
			case 0:
			switch (method) {
			case 0:{
			CropLoadCoreASM.cppASMlogger.info("[ASM] Patching CropBlock to be placeable on any soil");
			final String methodToPatch = "canPlaceBlockAt";
			final String methodToPatch_obf = "func_149742_c";
			String name = isObfuscated?methodToPatch:methodToPatch_obf;
			String desc = isObfuscated?"(Lnet/minecraft/world/World;III)Z":"(Lahb;III)Z";
			ClassReader reader = new ClassReader(basicClass);
			ClassNode classNode = new ClassNode();
			
			reader.accept(classNode,0);
			
			final List<MethodNode> methods = classNode.methods;
			
			for(MethodNode methodNode: methods){
			    if(methodNode.name.equals(name)){
			    	InsnList insnList = new InsnList();
			        insnList.add(new VarInsnNode(Opcodes.ALOAD, 1));
			        insnList.add(new VarInsnNode(Opcodes.ILOAD, 2));
			        insnList.add(new VarInsnNode(Opcodes.ILOAD, 3));
			        insnList.add(new VarInsnNode(Opcodes.ILOAD, 4));
			        insnList.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/github/bartimaeusnek/ASM/CropStickTransformerReplaceMethod", "patchedcanPlaceBlockAt", desc, false));
			        insnList.add(new InsnNode(Opcodes.IRETURN));
			        methodNode.instructions = insnList;
			    }
			}
			ClassWriter cw = new ClassWriter(reader,ClassReader.EXPAND_FRAMES | ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
			classNode.accept(cw);
			return cw.toByteArray();
			}
			
			case 1:{
				CropLoadCoreASM.cppASMlogger.info("[ASM] Patching CropBlock to not pop off when neighbours change");
				String methodToPatch = "onNeighborBlockChange";
				String methodToPatch_obf = "func_149695_a";
				String name = isObfuscated?methodToPatch:methodToPatch_obf;
				String desc = isObfuscated?"(Lnet/minecraft/world/World;IIILnet/minecraft/block/Block;)V":"(Lahb;IIILaji;)V";
				ClassReader reader = new ClassReader(basicClass);
				ClassNode classNode = new ClassNode();
				
				reader.accept(classNode,0);
				
				final List<MethodNode> methods = classNode.methods;
				
				for(MethodNode methodNode: methods){
				    if(methodNode.name.equals(name)){
				    	InsnList insnList = new InsnList();
				        insnList.add(new VarInsnNode(Opcodes.ALOAD, 1));
				        insnList.add(new VarInsnNode(Opcodes.ILOAD, 2));
				        insnList.add(new VarInsnNode(Opcodes.ILOAD, 3));
				        insnList.add(new VarInsnNode(Opcodes.ILOAD, 4));
				        insnList.add(new VarInsnNode(Opcodes.ALOAD, 5));
				        insnList.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/github/bartimaeusnek/ASM/CropStickTransformerReplaceMethod", "patchedonNeighborBlockChange", desc, false));
				        insnList.add(new InsnNode(Opcodes.RETURN));
				        methodNode.instructions = insnList;
				    }
				}

				ClassWriter cw = new ClassWriter(reader,ClassReader.EXPAND_FRAMES | ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
				classNode.accept(cw);
				return cw.toByteArray();
			}
			}
			}
			return basicClass;
			
			
			
/*
			MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, name, desc, null, null);
			mv.visitCode();
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitVarInsn(Opcodes.ILOAD, 1);
			mv.visitVarInsn(Opcodes.ILOAD, 2);
			mv.visitVarInsn(Opcodes.ILOAD, 3);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/github/bartimaeusnek/ASM/CropStickTransformerReplaceMethod", "patchedcanPlaceBlockAt", desc, false);
			mv.visitInsn(Opcodes.IRETURN);
			mv.visitEnd();

			reader.accept(cw, 0);
			return cw.toByteArray();*/
		}catch (Exception e) {
			e.printStackTrace();
			return basicClass;
		}
		
	}
	
}
