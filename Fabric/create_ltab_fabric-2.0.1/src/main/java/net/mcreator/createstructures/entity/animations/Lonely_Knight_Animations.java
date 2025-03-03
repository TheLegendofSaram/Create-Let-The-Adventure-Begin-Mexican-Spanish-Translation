package net.mcreator.createstructures.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class Lonely_Knight_Animations {


    public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(4f).looping()
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("rightarm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("leftarm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();
    public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(1.3433333f).looping()
            .addAnimation("rightleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(24.77f, 0.97f, -2.32f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(14.77f, 0.55f, -2.45f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-15.2f, -0.74f, -2.4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(-25.18f, -1.14f, -2.23f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-15.2f, -0.74f, -2.4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, KeyframeAnimations.degreeVec(14.77f, 0.55f, -2.45f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.3433333f, KeyframeAnimations.degreeVec(24.77f, 0.97f, -2.32f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("leftleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-24.91f, 2.17f, -1.24f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-14.94f, 2.35f, -0.85f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 2.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(14.97f, 2.46f, 0.44f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(24.94f, 2.35f, 0.86f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(14.97f, 2.46f, 0.44f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 2.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, KeyframeAnimations.degreeVec(-14.94f, 2.35f, -0.85f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.3433333f, KeyframeAnimations.degreeVec(-24.91f, 2.17f, -1.24f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerleftleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(15f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(25f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(25f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(10f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(15f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.3433333f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("Knight",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, -0.25f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, -0.25f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.3433333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerrightleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(25f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(25f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.3433333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -0.25f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("rightarm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, -5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.3433333f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("leftarm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, -5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.3433333f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();
    public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(1.5f)
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -27.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, 35f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("rightarm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 1f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, -2f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(1f, 0f, 2f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 1f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("rightarm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(87.5f, -40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(37.95f, 43.93f, 67.17f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("rightlowerarm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 45f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, 0f, -7.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("Knight",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -0.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, -0.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("leftarm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 2.25f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 0f, -3f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("leftarm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-12.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(45.94f, 10.05f, 7.5f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("rightleg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, -1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(1f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("rightleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -16.25f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, 38.75f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("leftleg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, -0.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("leftleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-17.1f, -20.17f, -0.14f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerleftleg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
}