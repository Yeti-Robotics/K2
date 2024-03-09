package frc.robot;


import com.pathplanner.lib.path.PathConstraints;
import frc.robot.generated.TunerConstants;

public final class AutoConstants {

    public static final double MAX_SPEED = TunerConstants.kSpeedAt12VoltsMps;
    public static final double MAX_ACCEL = TunerConstants.kSpeedAt12VoltsMps;
    public static final double MAX_THETA_VELOCITY =  MAX_SPEED / Math.hypot(22.25 / 2, 22.25 / 2);
    public static final double MAX_THETA_ACCEL = MAX_SPEED / Math.hypot(22.25 / 2, 22.25 / 2);
    public static final PathConstraints DEFAULT_CONSTRAINTS = new PathConstraints(
            MAX_SPEED,
            MAX_ACCEL,
            MAX_THETA_VELOCITY,
            MAX_THETA_ACCEL);

    public enum AutoModes {
        TESTING("amp4ThreePiece", DEFAULT_CONSTRAINTS),
        AMP_5_THREE_PIECE("amp5ThreePiece", DEFAULT_CONSTRAINTS),
        SOURCE_4_THREE_PIECE("source4ThreePiece", DEFAULT_CONSTRAINTS),
        AMP_4_THREE_PIECE("amp4ThreePiece", DEFAULT_CONSTRAINTS),
        NEW_AUTO("New Auto", DEFAULT_CONSTRAINTS),
        MID_3_THREE_PIECE("mid3ThreePiece",DEFAULT_CONSTRAINTS);

        public final String name;
        public final PathConstraints initConstraint;
        public final PathConstraints[] pathConstraints;

        AutoModes(String name, PathConstraints initConstraint, PathConstraints... pathConstraints) {
            this.name = name;
            this.initConstraint = initConstraint;
            this.pathConstraints = pathConstraints;
        }
    }}

