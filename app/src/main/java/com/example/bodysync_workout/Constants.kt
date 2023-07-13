package com.example.bodysync_workout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()
        val backwardAbdominalStretch = ExerciseModel(1, "Backward Abdominal Stretch", R.drawable.ic_backwards_abdominal_stretch, false, false,)
        val bodyWeightTricepsExtension = ExerciseModel(2, "Body-Weight Triceps Extension", R
            .drawable
            .ic_bodyweight_triceps_extension, false, false,)
        val birdDog = ExerciseModel(3, "Bird Dog", R.drawable
            .ic_bird_dog_v2, false, false,)
        val childPose = ExerciseModel(4, "Child Pose", R.drawable
            .ic_child_pose, false, false,)
        val cobraPushUps = ExerciseModel(5, "Cobra Push-Ups", R.drawable
            .ic_cobra_push_up, false, false,)
        val elbowsBackStretch = ExerciseModel(6, "Elbow Back Stretch", R.drawable
            .ic_elbows_back_stretch, false, false,)
        val gobletKettleBellSquat = ExerciseModel(7, "Goblet Kettle-Bell Squat", R.drawable
            .ic_goblet_kettlebell_squat, false, false,)
        val kneeToChestStretch = ExerciseModel(8, "Knee To Chest Stretch", R.drawable
            .ic_knee_to_chest_stretch, false, false,)
        val legsHandReachSpineStretch = ExerciseModel(9, "Legs-Hand Reach Spine Stretch", R.drawable
            .ic_legs_hand_reach_spine_stretch, false, false,)
        val lunge = ExerciseModel(10, "Lunges", R.drawable
            .ic_lunge, false, false,)
        val lyingProneAbdominalStretch = ExerciseModel(11, "Lying Prone Abdominal Stretch", R
            .drawable
            .ic_lying_prone_abdominal_stretch_side_pov, false, false,)
        val plyoSideLungeStretch = ExerciseModel(12, "Plyo Side Lunge Stretch", R.drawable
            .ic_plyo_side_lunge_stretch, false, false,)
        exerciseList.add(backwardAbdominalStretch)
        exerciseList.add(bodyWeightTricepsExtension)
        exerciseList.add(birdDog)
        exerciseList.add(childPose)
        exerciseList.add(cobraPushUps)
        exerciseList.add(elbowsBackStretch)
        exerciseList.add(gobletKettleBellSquat)
        exerciseList.add(kneeToChestStretch)
        exerciseList.add(legsHandReachSpineStretch)
        exerciseList.add(lunge)
        exerciseList.add(lyingProneAbdominalStretch)
        exerciseList.add(plyoSideLungeStretch)
        return exerciseList
    }
}